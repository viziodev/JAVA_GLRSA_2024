package entities;

import enums.TypeTransc;

public class Transaction {
   private int id;
   private double montant;
   private TypeTransc type;

   
public Transaction(int id, double montant, TypeTransc type) {
    this.id = id;
    this.montant = montant;
    this.type = type;
}


public Transaction() {
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public double getMontant() {
    return montant;
}


public void setMontant(double montant) {
    this.montant = montant;
}


public TypeTransc getType() {
    return type;
}


public void setType(TypeTransc type) {
    this.type = type;
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    long temp;
    temp = Double.doubleToLongBits(montant);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Transaction other = (Transaction) obj;
    if (id != other.id)
        return false;
    if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
        return false;
    if (type != other.type)
        return false;
    return true;
}


@Override
public String toString() {
    return "Transaction [id=" + id + ", montant=" + montant + ", type=" + type + "]";
}


@Override
protected Object clone() throws CloneNotSupportedException {
    return new Transaction(this.id,this.montant,this.type);
}



   
   
   
}
