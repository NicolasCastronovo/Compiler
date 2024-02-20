package be.unamur.info.b314.compiler.symbols.models;

import be.unamur.info.b314.compiler.exception.SemanticException;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ScalarVariableSymbol extends Symbol {
    private ScalarTypeEnum type;

    public void setValue(Object value) {
        Class correctClass = null;
        switch (this.type) {
            case BOOLEAN:
                correctClass = Boolean.class;
                break;
            case INTEGER:
                correctClass = Integer.class;
                break;
            case CHAR:
                correctClass = Character.class;
                break;
            case VOID:
                correctClass = Void.class;
        }
        if (value != null && !value.getClass().equals(correctClass)) {
            throw new SemanticException("La ScalarVariable de type " + this.type + " ne peut pas recevoir une valeur de type " + value.getClass().getSimpleName());
        }
        super.setValue(value);
    }
}