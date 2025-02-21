package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Categoria;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class ClienteRequest {
    @NotBlank(message = "O nome é obrigatório!")
    @Size(min = 3, max = 150, message = "O nome deve ter entre 3 e 150 caracteres")
    private String nome;
    @Min(value = 18, message = "O cliente deve ter no minimo 18 anos.")
    private int idade;
    @Email(message = "Email fora do formato correto")
    private String email;
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d\\W]{8,}$",
            message = "A senha deve conter pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.")
    private String senha;
    @CPF(message = "Cpf fora do formato correto")
    private String cpf;
    @NotNull(message = "A categoria é obrigatoria!")
    private Categoria categoria;

}
