package be.unamur.info.b314.compiler.symbols.models;

import be.unamur.info.b314.compiler.PlayPlusParser;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ScalarTypeEnum {
    BOOLEAN("boolean"),
    INTEGER("integer"),
    CHAR("char"),
    VOID("void");

    private final String text;

    /**
     * @param scalar le ScalarContext
     * @return le ScalarTypeEnum correspondant au ScalarContext
     */
    public static ScalarTypeEnum fromScalar(PlayPlusParser.ScalarContext scalar) {
        return scalar == null ? VOID : fromText(scalar.getText());
    }

    private static ScalarTypeEnum fromText(final String text) {
        for (ScalarTypeEnum scalarTypeEnum : values()) {
            if (scalarTypeEnum.getText().equals(text)) {
                return scalarTypeEnum;
            }
        }
        throw new IllegalArgumentException("ScalarTypeEnum.text = " + text + " is not supported");
    }
}