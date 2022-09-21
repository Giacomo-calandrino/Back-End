package it.epicode.gestioneincendi.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import it.epicode.be.gestioneincendi.model.CentroControlloProxy;
import it.epicode.be.gestioneincendi.model.InfoSonda;

public class CentroControlloTest extends CentroControlloProxy {
	
	
	

	@Override
	public void rilevaIncendio(InfoSonda info) {
		assertNotNull(info);
		assertNotNull(info.getIdSonda());
		assertNotNull(info.getLatitude());
		assertNotNull(info.getLongitude());
		assertNotNull(info.getSmokeLevel());
		assertNotEquals(0L, info.getSmokeLevel());
		throw new RuntimeException("Incendio Rilevato");
	}
	
	
}
