package com.example.atividade;

import org.springframework.web.bind.annotation.*;

@RestController
public class EndPoint {

    Usuario us1 = new Usuario("Yuri", 169999999, 123456701);

    @GetMapping("/usuario")
    public Usuario getUsuario() {
        return us1;
    }

    @PostMapping("/usuario")
    public String postUsuario(@RequestBody Usuario novoUsuario) {
        us1 = novoUsuario;
        return "Usuário adicionado";
    }

    @PutMapping("/usuario")
    public String putUsuario(@RequestBody Usuario usuarioAtualizado) {
        us1 = usuarioAtualizado;
        return "Usuário atualizado";
    }

    @DeleteMapping("/usuario")
    public String deleteUsuario() {
        us1 = null;
        return "Usuário deletado";
    }
}
