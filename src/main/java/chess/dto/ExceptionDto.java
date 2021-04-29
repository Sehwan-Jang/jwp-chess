package chess.dto;

public class ExceptionDto {
    private final String errorMessage;

    public ExceptionDto(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
