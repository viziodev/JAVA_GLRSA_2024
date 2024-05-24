package ism.glrsa.data.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ism.glrsa.data.entity.Classe;
import ism.glrsa.data.enums.Filiere;
import ism.glrsa.data.enums.Niveau;

public class ClasseRepositoryBdImpl implements RepositoryBD {

    @Override
    public boolean insert(Classe classe) {
        int nbre=0;
       //1-Charger le Driver de Mysql
       Connection conn=null;
       //@server:port ==> localhost:3306
               //port ==> windows 3306 mac ==>8889
       //
        try {
          //Essayer
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/ges_cours_glrsa","root","root");
          //Statement ou PreparedStatement  ==> Executer des requetes
              //executeQuery()  ==> requete select
              //executeUpdate() ==> requete insert,update et delete
             Statement statement=conn.createStatement();
              nbre= statement.executeUpdate(String.format("INSERT INTO `classe` ( `nom_classe`, `filiere`, `niveau`) VALUES ('%s', '%s', '%s')",classe.getNomClasse(),classe.getFiliere().name(),classe.getNiveau().name()));
          System.out.println("Connexion Bd etablie");
       } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement du Driver");
       } catch (SQLException e) {
          System.out.println("Erreur de Connexion a votre BD");
      }
          return nbre==0;
    }

    @Override
    public boolean update(Classe objet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Classe> selectAll() {
        List<Classe> classes=new ArrayList<>();
         //1-Charger le Driver de Mysql
            Connection conn=null;
             //@server:port ==> localhost:3306
                     //port ==> windows 3306 mac ==>8889
             //
              try {
                //Essayer
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/ges_cours_glrsa","root","root");
                //Statement ou PreparedStatement  ==> Executer des requetes
                    //executeQuery()  ==> requete select
                    //executeUpdate() ==> requete insert,update et delete
                 Statement statement=conn.createStatement();
                 ResultSet rs= statement.executeQuery("SELECT * FROM `classe`");
                   while (rs.next()) {
                      //ligne de la table classe
                       Classe classe=new Classe();
                       classe.setId(rs.getInt("id"));
                       classe.setNomClasse(rs.getString("nom_classe"));
                       classe.setFiliere(Filiere.getValue(rs.getString("filiere")));
                       classe.setNiveau(Niveau.getValue(rs.getString("niveau")));
                       classes.add(classe);
                   }
                System.out.println("Connexion Bd etablie");
             } catch (ClassNotFoundException e) {
                System.out.println("Erreur de chargement du Driver");
             } catch (SQLException e) {
                System.out.println("Erreur de Connexion a votre BD");
            }
            return  classes;
    }

    @Override
    public Classe selectById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectById'");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public Classe selectByLibelle(String libelle) {
         Classe classe=null;
        //1-Charger le Driver de Mysql
           Connection conn=null;
            //@server:port ==> localhost:3306
                    //port ==> windows 3306 mac ==>8889
            //
             try {
               //Essayer
               Class.forName("com.mysql.cj.jdbc.Driver");
               conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/ges_cours_glrsa","root","root");
               //Statement ou PreparedStatement  ==> Executer des requetes
                   //executeQuery()  ==> requete select
                   //executeUpdate() ==> requete insert,update et delete
                Statement statement=conn.createStatement();
                ResultSet rs= statement.executeQuery(String.format("SELECT *  FROM `classe` WHERE `nom_classe` like  '%s'", libelle));
                  if (rs.next()) {
                     //ligne de la table classe
                       classe=new Classe();
                       classe.setId(rs.getInt("id"));
                       classe.setNomClasse(rs.getString("nom_classe"));
                       classe.setFiliere(Filiere.getValue(rs.getString("filiere")));
                       classe.setNiveau(Niveau.getValue(rs.getString("niveau")));
                  }
            } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement du Driver");
            } catch (SQLException e) {
               System.out.println("Erreur de Connexion a votre BD");
           }
           return  classe;
    }
    
}
