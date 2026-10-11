package com.fm_java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.fm_java.entity.Client;

@Service
public class ClientService {
  private List<Client> clients = new ArrayList<>();
  private AtomicLong sequence = new AtomicLong();

  public List<Client> trouverTous() {
    return this.clients;
  }

  public void ajouter(Client newClient) {
    newClient.setId(sequence.incrementAndGet());
    clients.add(newClient);
  }
}
