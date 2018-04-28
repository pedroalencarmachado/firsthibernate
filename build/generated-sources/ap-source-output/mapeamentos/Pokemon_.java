package mapeamentos;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pokemon.class)
public abstract class Pokemon_ {

	public static volatile SingularAttribute<Pokemon, Tipo> tipo;
	public static volatile SingularAttribute<Pokemon, Integer> codPokemon;
	public static volatile SingularAttribute<Pokemon, String> nome;
	public static volatile CollectionAttribute<Pokemon, Pokemon> treina;

}

