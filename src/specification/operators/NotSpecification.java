package specification.operators;

import specification.contacts.CompositeSpecification;
import specification.contacts.Specification;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public class NotSpecification<T> extends CompositeSpecification<T>
{
	
	private Specification<T> wrapped;
	
	public NotSpecification(Specification<T> specification)
	{
		this.setWrapped(specification);
	}
	
	public Specification<T> getWrapped()
	{
		return this.wrapped;
	}
	
	public void setWrapped(Specification<T> wrappedSpecification)
	{
		this.wrapped = wrappedSpecification;
	}
	
	@Override
	public boolean isSatisfiedBy(T candidate)
	{
		return !this.wrapped.isSatisfiedBy(candidate);
	}
	
}
