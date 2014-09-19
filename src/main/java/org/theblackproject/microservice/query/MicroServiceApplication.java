package org.theblackproject.microservice.query;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.extern.slf4j.Slf4j;
import org.theblackproject.microservice.query.resources.MicroServiceResource;


@Slf4j
public class MicroServiceApplication extends Application<MicroServiceConfiguration> {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			args = new String[]{"server", "src/main/resources/config.yml"};
		}
		new MicroServiceApplication().run(args);
	}

	@Override
	public String getName() {
		return "JAMS (Just Another Micro Service)";
	}

	@Override
	public void initialize(Bootstrap<MicroServiceConfiguration> bootstrap) {
	}

	@Override
	public void run(MicroServiceConfiguration microServiceConfiguration, final Environment environment) throws Exception {
		environment.jersey().register(new MicroServiceResource());
	}
}
