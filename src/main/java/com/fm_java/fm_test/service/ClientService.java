package com.fm_java.fm_test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.fm_java.fm_test.model.Client;
import org.springframework.stereotype.Service;


@Service
public class ClientService {
  private List<Client> clients = new ArrayList<>();
  private AtomicLong sequence = new AtomicLong();

  public List<Client> trouverTous() {
    return clients;
  }

  public void ajouter(Client newClient) {
    newClient.setId(sequence.incrementAndGet());
    clients.add(newClient);
  }
}
