/**
 * @param
 * @return
 */
public class Faction {
    private Integer factionID;
    private String faction;
    private String description;
    private String demonym;

    public Faction(Integer factionID, String faction, String description) {
        this.factionID = factionID;
        this.faction = faction;
        this.description = description;
    }

    public Integer getFactionID() {
        this.factionID = factionID;
        return factionID;
    }

    public String getFaction() {
        this.faction = faction;
        return faction;
    }

    public String getDescription() {
        this.description = description;
        return description;
    }

    public String getDemonym() {
        this.demonym = demonym;
        return demonym;
    }
}
