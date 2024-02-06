package ru.overthantutor.domen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@AllArgsConstructor
@Setter
@Getter
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(lastName)
                .append(firstName)
                .append(age)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(lastName)
                .append(firstName)
                .append(age)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Person person)) return false;

        return new EqualsBuilder().append(lastName, person.lastName).append(firstName, person.firstName).append(age, person.age).isEquals();
    }
}
