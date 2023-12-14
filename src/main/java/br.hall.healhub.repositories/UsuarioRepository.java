package br.hall.healhub.repositories;

import br.hall.healhub.model.Diaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface DiariaRepository extends JpaRepository <Diaria Long> {

    @Query ("SELECT u FROM Diaria u where d.coposDAgua >=3")
    public List<Diaria> getMetaPraCima(); 
}