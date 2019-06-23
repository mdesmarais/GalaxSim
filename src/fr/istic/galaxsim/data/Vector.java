package fr.istic.galaxsim.data;

/**
 * classe permettant de d�finir une coordonnee 3d
 * @author anaofind
 *
 */
public class Vector {
	
	/**
	 * coordonn�e x
	 */
	private double x;
	
	/**
	 * coordonn�e y
	 */
	private double y;
	
	/**
	 * coordonn�e z
	 */
	private double z;
	
	/**
	 * constructeur
	 * @param x la coordonn�e x
	 * @param y la coordonn�e y
	 * @param z la coordonn�e z
	 */
	public Vector(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * getter coordonn�e x
	 * @return la coordonn�e x
	 */
	public double getX() {
		return x;
	}

	/**
	 * getter coordonn�e y
	 * @return la coordonn�e y
	 */
	public double getY() {
		return y;
	}

	/**
	 * getter coordonn�e z
	 * @return la coordonn�e z
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * methode permetant de savoir si le point est ou non dans les intervalles de coordon�es [x1,x2], [y1,y2], [z1,z2]
	 * @param x1 la coordonnee x min
	 * @param x2 la coordonnee x max
	 * @param y1 la coordonnee y min
	 * @param y2 la coordonnee y max
	 * @param z1 la coordonnee z min
	 * @param z2 la coordonnee z max
	 * @return 1 si le poit est pr�sent dans l'intervalle, sinon 0
	 */
	public boolean isIn(double x1,double x2, double y1,double y2,double z1,double z2) {
		return x1<=x && x2>=x && y1<= y && y2>=y && z1<=z && z2>=z;
	}
	
	
}