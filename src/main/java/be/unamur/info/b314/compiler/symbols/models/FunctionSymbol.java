package be.unamur.info.b314.compiler.symbols.models;

import be.unamur.info.b314.compiler.PlayPlusParser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FunctionSymbol extends Symbol {
    private ScalarTypeEnum returnType;
    private List<Symbol> argumentList;
    private PlayPlusParser.FctDeclContext fctDeclContext;
}