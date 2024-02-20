package be.unamur.info.b314.compiler.symbols.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.antlr.v4.runtime.ParserRuleContext;

@Data
@SuperBuilder
@NoArgsConstructor
public class Symbol {
    private String name;
    private ParserRuleContext scope;
    private SymbolTypeEnum symbolType;
    private Object value;
}