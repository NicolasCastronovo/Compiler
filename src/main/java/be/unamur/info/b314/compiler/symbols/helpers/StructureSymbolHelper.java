package be.unamur.info.b314.compiler.symbols.helpers;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.symbols.models.StructureSymbol;
import be.unamur.info.b314.compiler.symbols.models.Symbol;
import be.unamur.info.b314.compiler.symbols.models.SymbolTypeEnum;
import com.google.common.collect.Maps;
import lombok.experimental.UtilityClass;
import lombok.val;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe utilitaire (statique) fourni une méthodes utiles pour les StructureSymbol
 */
@UtilityClass
public class StructureSymbolHelper {
    /**
     * Construit un StructureSymbol à partir d'un arrayContext
     *
     * @param name             le nom de la structure
     * @param scope            le scope de la structure
     * @param structureContext le structureContext
     * @return le StructureSymbol correspondant au structureContext
     */
    public StructureSymbol fromStructureContext(final String name, final ParserRuleContext scope, final PlayPlusParser.StructureContext structureContext) {
        final List<Symbol> symbolList = new ArrayList<>();
        for (PlayPlusParser.VarDeclContext varDeclContext : structureContext.varDecl()) {
            val typeSubDeclContext = varDeclContext.typeSubDecl();
            symbolList.addAll(SymbolHelper.typeSubDeclContextToSymbolsMapper(structureContext, typeSubDeclContext));
        }

        val records = Maps.uniqueIndex(symbolList, Symbol::getName);

        return StructureSymbol.builder()
                .name(name)
                .scope(scope)
                .symbolType(SymbolTypeEnum.STRUCTURE)
                .records(records)
                .build();
    }
}
