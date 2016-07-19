package net.bolero.epo.strutsspring;

import org.springframework.stereotype.Component;

@Component
public class UserBO {
	private String name = "userBOManagedBean";
	public String getName() {
		return name;
	}
}
