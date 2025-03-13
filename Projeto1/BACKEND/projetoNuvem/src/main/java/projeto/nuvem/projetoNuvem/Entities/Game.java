package projeto.nuvem.projetoNuvem.Entities;

public class Game{
    private String name;
    private String description;
    private String image;
	private String plataform;
    private String developer;
    private String publisher;
    

    public Game(String name, String description, String image, String plataform, String developer, String publisher){
        this.name = name;
        this.description = description;
        this.image = image;
        this.plataform = plataform;
        this.developer = developer;
        this.publisher = publisher;
    }
    

    public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}