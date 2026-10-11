package com.fm_java.fm_test.controller;

import com.fm_java.fm_test.model.Client;
import com.fm_java.fm_test.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String liste(Model model) {
        model.addAttribute("clients", clientService.trouverTous());
        return "clients/liste";
    }

    @GetMapping("/clients/nouveau")
    public String formulaire(Model model) {
        model.addAttribute("client", new Client());
        return "clients/formulaire";
    }

    @PostMapping("/clients")
    public String ajouter(Client client) {
        clientService.ajouter(client);
        return "redirect:/clients";
    }
}
