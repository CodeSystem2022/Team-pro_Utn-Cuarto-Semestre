package ar.com.utnfrsr.todoapp.context;


@Configuration /*la clase con esta configuracion tiene la capacidad de crear bienes, los cuales forman parte de la aplication*/
public class OpenApiConfig {

    @Bean
    public OpenAPI OngAPI() {
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .info(new info()
                        .title("ToDo API")
                        .description("La API REST de ToDo App.")
                        .version("v1"))
                .externalDocs(mew ExternalDocumentation()
                        .description("")
                        .url(""))
                .addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}