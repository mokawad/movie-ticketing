package edu.csumb.xtreme.movieticketing;

import edu.csumb.xtreme.movieticketing.dao.BookingDao;
import edu.csumb.xtreme.movieticketing.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

    @Autowired
    MovieDao movieDao;

    @Autowired
    BookingDao bookingDao;


    @GetMapping("/movie")
    public String movie(
        @RequestParam(name = "id", required = true, defaultValue = "0") int id,
        Model model) {
        model.addAttribute("movie", movieDao.findAll().get(id));
        //model.addAttribute("bookings", bookingDao.findAll().get(id));
        //model.addAllAttributes(movieDao);
        return "movie";
    }


}