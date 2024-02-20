package be.unamur.info.b314.compiler.symbols.manager;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SemanticException;
import be.unamur.info.b314.compiler.symbols.models.FunctionSymbol;
import be.unamur.info.b314.compiler.symbols.models.Symbol;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cette classe gère la symbolMap
 */
@Getter
@Setter
public class SymbolMapManager {

    /**
     * Voici la table des symboles, organisé par contexte, le contexte lui même correspond au scope. le String c'est le "name" du symbole, et le Symbol le symbole lui même.
     */
    private final Map<ParserRuleContext, Map<String, Symbol>> symbolMap = new HashMap<>();

    /**
     * Les contexte programmeContext qui correspond au global scope
     */
    private PlayPlusParser.ProgrammeContext programGlobalScope;

    /**
     * Ajoute une liste de symboles dans la symbolMap
     *
     * @param context le contexte qui correspond au scope du symbole
     * @param symbol  le symbole à ajouter
     */
    public void addSymbol(final ParserRuleContext context, final Symbol symbol) {
        this.addSymbols(context, Collections.singletonList(symbol));
    }

    /**
     * Ajoute une liste de symboles dans la symbolMap
     *
     * @param context le contexte qui correspond au scope du symbole
     * @param symbol  le symbole à ajouter
     */
    public void addSymbols(final ParserRuleContext context, final List<Symbol> symbol) {
        if (!symbolMap.containsKey(context)) {
            symbolMap.put(context, new HashMap<>());
        }
        for (Symbol currentSymbol : symbol) {
            symbolMap.get(context).put(currentSymbol.getName(), currentSymbol);
        }
    }

    /**
     * Trouve un symbole dans la symbolMap, à partir du contexte donné
     *
     * @param context le contexte de départ
     * @param name    le nom symbole à trouver
     * @return le symbole trouvé
     */
    public Symbol findSymbol(ParserRuleContext context, String name) {
        while (context != null) {
            if (symbolMap.containsKey(context)) {
                if (symbolMap.get(context).containsKey(name)) {
                    return symbolMap.get(context).get(name);

                } else {
                    context = context.getParent();
                }
            } else {
                context = context.getParent();
            }
        }
        throw new SemanticException("Un symbole avec le nom " + name + " n'existe pas");
    }

    /**
     * Vérifie si un symbole existe dans le global scope
     *
     * @param name nom du symbole dont on veut vérifier l'existence dans le global scope
     * @return true si le symbole existe dans le global scope sinon non
     */
    public boolean symbolExistsInGlobalScope(final String name) {
        return symbolMap.get(programGlobalScope).containsKey(name);
    }

    /**
     * Trouve le FunctionSymbol avec le nom name
     *
     * @param name nom de la function à trouver
     * @return la FunctionSymbol trouvée
     */
    public FunctionSymbol findFunctionSymbol(final String name) {
        return (FunctionSymbol) symbolMap.get(programGlobalScope).get(name);
    }
}
