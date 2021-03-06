package ru.equifax.hbn;
// default package
// Generated 21.10.2017 15:03:38 by Hibernate Tools 5.2.3.Final

/**
 * FilmActorId generated by hbm2java
 */
public class FilmActorId implements java.io.Serializable {

	private short actorId;
	private short filmId;

	public FilmActorId() {
	}

	public FilmActorId(short actorId, short filmId) {
		this.actorId = actorId;
		this.filmId = filmId;
	}

	public short getActorId() {
		return this.actorId;
	}

	public void setActorId(short actorId) {
		this.actorId = actorId;
	}

	public short getFilmId() {
		return this.filmId;
	}

	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FilmActorId))
			return false;
		FilmActorId castOther = (FilmActorId) other;

		return (this.getActorId() == castOther.getActorId()) && (this.getFilmId() == castOther.getFilmId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getActorId();
		result = 37 * result + this.getFilmId();
		return result;
	}

}
