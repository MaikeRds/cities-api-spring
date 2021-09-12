package com.maike.rodrigues.app.staties.services;

import com.maike.rodrigues.app.staties.entities.State;
import com.maike.rodrigues.app.staties.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateService {

    private StateRepository stateRepository;

    public List<State> findAll() {
        return stateRepository.findAll();
    }
}
