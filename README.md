# api-response

## Visão Geral

A classe `ApiResponse<T>` é uma classe utilitária genérica usada para padronizar a estrutura das respostas na sua API. Essa classe fornece um formato claro e consistente tanto para respostas bem-sucedidas quanto para falhas.

## Estrutura

A classe `ApiResponse` consiste nos seguintes campos:

- **`data`** (`T`): Os dados reais retornados na resposta. É do tipo genérico `T`, permitindo flexibilidade para vários tipos de dados.
- **`message`** (`String`): Uma mensagem indicando o resultado da operação (por exemplo, "Sucesso" ou uma mensagem de erro).
- **`success`** (`boolean`): Um flag que indica se a operação foi bem-sucedida (`true`) ou não (`false`).
- **`code`** (`int`): O código de status HTTP da resposta.

## Construtor

```java
public ApiResponse(T data, String message, boolean success, int code) {
        this.data = data; // Os dados da resposta do tipo T.
        this.message = message; // A mensagem associada à resposta.
        this.success = success; // Indica se a requisição foi bem-sucedida.
        this.code = code; // O código de status HTTP.
    }
```

## Métodos Estáticos

A classe ApiResponse fornece dois métodos de fábrica estáticos para facilitar a criação de respostas:

- **success(T data, int code)**: Gera uma resposta bem-sucedida com os dados e um código de status HTTP.
- **failure(String message, int code)**: Gera uma resposta de falha com uma mensagem de erro e um código de status HTTP.