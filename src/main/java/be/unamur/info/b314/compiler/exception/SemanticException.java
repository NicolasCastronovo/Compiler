package be.unamur.info.b314.compiler.exception;

/**
 * Exception à utiliser dans le visiteur lorsqu'il y a une erreur de sémantique
 */
public class SemanticException extends RuntimeException {
    public SemanticException(String message) {
        super(message);
    }
}
