import java.util.ArrayList;
import java.util.List;

class Institute {
    private String name;
    private String address;
    private List<ResearchAssociate> researches = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addResearch(ResearchAssociate e) {
        researches.add(e);
    }

    public void removeResearch(ResearchAssociate e) {
        researches.remove(e);
    }

    public String getName() {
        return name;
    }
}