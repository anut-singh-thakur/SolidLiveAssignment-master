package net.media.training.srp;

import net.media.training.live.srp.Employee;
import net.media.training.live.srp.Address;
import net.media.training.live.srp.Leave;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 20, 2011
 * Time: 2:08:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeTest {

    @Test
    public void shouldReturnEmployeeInfo() {
        Address address = new Address("Baker Street", "London", "UK");
        Leave leave = new Leave(3, new int[]{1, 2, 4,7});

        Employee employee = new Employee(1, 345.123, "Sherlock Holmes",  address, leave);
        String employeeInfo = employee.toHTML();

        String expectedEmployeeInfo = "<div><h1>Employee Info</h1><div id='emp1'><span>Sherlock Holmes</span><div class='left'><span>Leave Left :</span><span>Annual Salary:</span><span>Manager:</span><span>Reimbursable Leave:</span></div><div class='right'><span>0</span><span>4141</span><span>None</span><span>13</span></div> </div>";

        assertEquals("Employee info should be equal", expectedEmployeeInfo, employeeInfo);
    }


}
