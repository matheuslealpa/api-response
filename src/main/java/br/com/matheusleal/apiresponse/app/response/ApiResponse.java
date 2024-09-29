package br.com.matheusleal.apiresponse.app.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {
    private T data;
    private String message;
    private boolean success;
    private int code;

    public ApiResponse(T data, String message, boolean success, int code) {
        this.data = data;
        this.message = message;
        this.success = success;
        this.code = code;
    }

    public static <T> ApiResponse<T> success(T data, int code) {
        return new ApiResponse<>(data, "Success", true, code);
    }

    public static <T> ApiResponse<T> failure(String message, int code) {
        return new ApiResponse<>(null, message, false, code);
    }
}
