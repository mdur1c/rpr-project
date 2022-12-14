package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class rent {
    private int idrent, idcar,id_user,duration;
    private String date;

    public int getId_user() {
        return id_user;
    }

    public int getDuration() {
        return duration;
    }

    public int getIdcar() {
        return idcar;
    }

    public int getIdrent() {
        return idrent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    public void setIdrent(int idrent) {
        this.idrent = idrent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof rent)) return false;
        rent rent = (rent) o;
        return getIdrent() == rent.getIdrent() && getIdcar() == rent.getIdcar() && getId_user() == rent.getId_user() && getDuration() == rent.getDuration() && getDate().equals(rent.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdrent(), getIdcar(), getId_user(), getDuration(), getDate());
    }
}
