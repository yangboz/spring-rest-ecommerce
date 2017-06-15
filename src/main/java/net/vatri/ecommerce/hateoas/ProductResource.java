package net.vatri.ecommerce.hateoas;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class ProductResource extends ResourceSupport {
    @JsonProperty public long id;
    public String name;
    public String price;
    public String description;
    public Object group;
}
