package be.unamur.info.b314.compiler.symbols.helpers;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.symbols.models.ArraySymbol;
import be.unamur.info.b314.compiler.symbols.models.ScalarTypeEnum;
import be.unamur.info.b314.compiler.symbols.models.Symbol;
import be.unamur.info.b314.compiler.symbols.models.SymbolTypeEnum;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import lombok.experimental.UtilityClass;
import lombok.val;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Cette classe utilitaire (statique) fourni une méthodes utiles pour les ArraySymbols
 */
@UtilityClass
public class ArraySymbolHelper {

    /**
     * Set une valeur de l'array symbol à l'index index
     *
     * @param symbol l'arraySymbol à modifier
     * @param value  la valeur
     * @param index  l'index
     */
    public void setArraySymbolValue(final Symbol symbol, final Object value, final Integer... index) {
        val arraySymbol = (ArraySymbol) symbol;
        if (arraySymbol.getSize().size() == 1) {
            val array1D = (List<Object>) arraySymbol.getValue();
            array1D.set(index[0], value);
        } else if (arraySymbol.getSize().size() == 2) {
            val array2D = (List<List<Object>>) arraySymbol.getValue();
            array2D.get(index[0]).set(index[1], value);
        }
    }

    /**
     * Construit un ArraySymbol à partir d'un arrayContext
     *
     * @param name         le nom de l'array
     * @param scope        le scope de l'array
     * @param arrayContext l'arrayContext
     * @return l'ArraySymbol correspondant à l'array
     */
    public ArraySymbol fromArrayContext(final String name, final ParserRuleContext scope, final PlayPlusParser.ArrayContext arrayContext) {
        val elemType = ScalarTypeEnum.fromScalar(arrayContext.scalar());
        val size = new ArrayList<Integer>();
        arrayContext.ENTIER().forEach(entier -> size.add(Integer.parseInt(entier.getText())));

        List list = null;
        switch (elemType) {
            case BOOLEAN:
                if (size.size() == 2) {
                    val array = new boolean[size.get(0)][size.get(1)];
                    list = Arrays.stream(array).map(Booleans::asList).collect(Collectors.toList());
                } else if (size.size() == 1) {
                    val array = new boolean[size.get(0)];
                    list = Booleans.asList(array);
                }
                break;
            case INTEGER:
                if (size.size() == 2) {
                    val array = new int[size.get(0)][size.get(1)];
                    list = Arrays.stream(array).map(Ints::asList).collect(Collectors.toList());
                } else if (size.size() == 1) {
                    val array = new int[size.get(0)];
                    list = Ints.asList(array);
                }
                break;
            case CHAR:
                if (size.size() == 2) {
                    val array = new char[size.get(0)][size.get(1)];
                    list = Arrays.stream(array).map(Chars::asList).collect(Collectors.toList());
                } else if (size.size() == 1) {
                    val array = new char[size.get(0)];
                    list = Chars.asList(array);
                }
                break;
            default:
                break;
        }

        return ArraySymbol.builder()
                .name(name)
                .elemType(ScalarTypeEnum.fromScalar(arrayContext.scalar()))
                .symbolType(SymbolTypeEnum.ARRAY)
                .scope(scope)
                .size(size)
                .value(list)
                .build();
    }
}
