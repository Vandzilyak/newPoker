package entity;

public class Card implements Comparable<Card>{
    private Integer id;
    private String name;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (id != card.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Card(int id, String name, String type) {

        this.id = id;
        this.name = name;
        this.type = type;
    }


    @Override
    public int compareTo(Card card) {
        return this.id.compareTo(card.getId());
    }
}
