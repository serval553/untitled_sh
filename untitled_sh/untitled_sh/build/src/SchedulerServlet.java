import com.company.Weekday;
import com.company.Course;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/SchedulerServlet"})
public class SchedulerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SchedulerServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<Course> courses = (ArrayList)session.getAttribute("courses");
        if (courses == null) {
            courses = new ArrayList();
        }

        Course course = new Course();
        course.setCourseName(request.getParameter("courseName"));
        course.setProfessor(request.getParameter("professor"));
        course.setTime(request.getParameter("time"));
        course.setRoomNumber(request.getParameter("roomNumber"));
        course.setStartDate(request.getParameter("startDate"));
        String[] weekdays = request.getParameterValues("weekday");
        Weekday[] occurrences = new Weekday[weekdays.length];

        for(int i = 0; i < weekdays.length; ++i) {
            occurrences[i] = Weekday.valueOf(weekdays[i]);
        }

        course.setOccurrences(occurrences);
        courses.add(course);
        session.setAttribute("courses", courses);
        RequestDispatcher dispatcher = request.getRequestDispatcher("course.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
