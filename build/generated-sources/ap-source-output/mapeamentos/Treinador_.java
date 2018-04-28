package mapeamentos;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Treinador.class)
public abstract class Treinador_ {

	public static volatile SingularAttribute<Treinador, Endereco> endereco;
	public static volatile SingularAttribute<Treinador, String> nome;
	public static volatile CollectionAttribute<Treinador, Treinador> treina;
	public static volatile SingularAttribute<Treinador, Integer> codTreinador;

}

