package be.unamur.info.b314.compiler.symbols.models;


import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
public class GameMapSymbol {
    private Character[][] gameMap;
    private int lines;
    private int columns;
    private Point position;
    private DirEnum dir;
}