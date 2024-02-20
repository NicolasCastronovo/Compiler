package be.unamur.info.b314.compiler.symbols.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArraySymbol extends Symbol {
    private ScalarTypeEnum elemType;
    private List<Integer> size;
}