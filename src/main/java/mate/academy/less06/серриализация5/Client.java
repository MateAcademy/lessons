package mate.academy.less06.серриализация5;

import java.io.Serializable;
import java.time.LocalDate;

public  class Client implements Serializable {
    private long id;
    private String name;
    private LocalDate birthDate;
    private transient int ageInYears;

    public long getID() { return id; }

    public void setID(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public LocalDate getBirthDate() { return birthDate; }

    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public int getAgeInYears() {
        if (ageInYears == 0) {
            ageInYears = birthDate.until(LocalDate.now()).getYears();
        }
        return ageInYears;
    }

}
