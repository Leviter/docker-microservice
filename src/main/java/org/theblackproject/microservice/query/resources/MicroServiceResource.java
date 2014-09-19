package org.theblackproject.microservice.query.resources;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

@AllArgsConstructor
@Slf4j
@Path("/microservice")
@Produces("application/json")
public class MicroServiceResource {

	private static final UUID RANDOM_UUID = UUID.randomUUID();

	@GET
	public String getLot() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String currentTime = date.format(calendar.getTime());
		return currentTime + " | You have just received a response from " + RANDOM_UUID;
	}
}
