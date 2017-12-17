using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adapter
{

    //client
    public class ThirdPartyBillingSystem
    {
        private ITarget employeeSource;

        public ThirdPartyBillingSystem(ITarget employeeSource)
        {
            this.employeeSource = employeeSource;
        }

        public void ShowEmployeeList()
        {
            List<string> employee = employeeSource.GetEmployeeList();

            Console.WriteLine("****** Seznam zaměstnanců *******");
            foreach (var item in employee)
            {
                Console.Write(item);
            }

        }
    }


    //target(cílové rozhraní, které vyžaduje klient)
    public interface ITarget
    {
        List<string> GetEmployeeList();
    }

    
    // Adaptee class(třída, která je přizpůsobována)
    
    public class HRSystem
    {
        public string[][] GetEmployees()
        {
            string[][] employees = new string[3][];

            employees[0] = new string[] { "100", "Novak", "Vedouci" };
            employees[1] = new string[] { "101", "Novotny", "Vyvojar" };
            employees[2] = new string[] { "102", "Kucera", "Vyvojar" };

            return employees;
        }
    }

    
    // Adapter class(třída, která přizbůsobuje adaptee na target)

    public class EmployeeAdapter : HRSystem, ITarget
    {
        public List<string> GetEmployeeList()
        {
            List<string> employeeList = new List<string>();
            string[][] employees = GetEmployees();
            foreach (string[] employee in employees)
            {
                employeeList.Add(employee[0]);
                employeeList.Add(",");
                employeeList.Add(employee[1]);
                employeeList.Add(",");
                employeeList.Add(employee[2]);
                employeeList.Add("\n");
            }

            return employeeList;
        }
    } 



    class Program
    {
        static void Main(string[] args)
        {
            ITarget Itarget = new EmployeeAdapter();
            ThirdPartyBillingSystem client = new ThirdPartyBillingSystem(Itarget);
            client.ShowEmployeeList();

            Console.ReadKey();
        }
    }
}
