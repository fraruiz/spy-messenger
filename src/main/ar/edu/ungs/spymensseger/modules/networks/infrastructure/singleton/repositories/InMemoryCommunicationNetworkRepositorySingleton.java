package ar.edu.ungs.spymensseger.modules.networks.infrastructure.singleton.repositories;

import ar.edu.ungs.spymensseger.modules.networks.domain.CommunicationNetworkRepository;
import ar.edu.ungs.spymensseger.modules.networks.infrastructure.persistence.inmemory.InMemoryCommunicationNetworkRepository;

public final class InMemoryCommunicationNetworkRepositorySingleton {
    private static CommunicationNetworkRepository instance;

    private InMemoryCommunicationNetworkRepositorySingleton() {
    }

    public static CommunicationNetworkRepository instance() {
        CommunicationNetworkRepository result = instance;
        if (result != null) {
            return result;
        }
        synchronized(CommunicationNetworkRepository.class) {
            if (instance == null) {
                instance = new InMemoryCommunicationNetworkRepository();
            }
            return instance;
        }
    }
}
