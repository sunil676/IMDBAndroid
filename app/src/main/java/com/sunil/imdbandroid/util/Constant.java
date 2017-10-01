package com.sunil.imdbandroid.util;

import com.sunil.imdbandroid.db.model.IMBD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunil on 30-09-2017.
 */

public class Constant {

    public static List<IMBD> getMoviesList(){
        List<IMBD> imbdList = new ArrayList<>();

        IMBD item1 = new IMBD();
        item1.setMovie_id(1);
        item1.setName("The Shawshank Redemption");
        item1.setYearofrelease(1994);
        item1.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BODU4MjU4NjIwNl5BMl5BanBnXkFtZTgwMDU2MjEyMDE@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item1.setRating(9.3);
        item1.setDetailLink("http://m.imdb.com/title/tt0111161/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_1");

        IMBD item2 = new IMBD();
        item2.setMovie_id(2);
        item2.setName("The Godfather ");
        item2.setYearofrelease(1972);
        item2.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BZTRmNjQ1ZDYtNDgzMy00OGE0LWE4N2YtNTkzNWQ5ZDhlNGJmL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UY128_CR2,0,86,128_AL_.jpg");
        item2.setRating(9.2);
        item2.setDetailLink("http://m.imdb.com/title/tt0068646/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_2");

        IMBD item3 = new IMBD();
        item3.setMovie_id(3);
        item3.setName("The Godfather: Part II");
        item3.setYearofrelease(1994);
        item3.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjZiNzIxNTQtNDc5Zi00YWY1LThkMTctMDgzYjY4YjI1YmQyL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UY128_CR2,0,86,128_AL_.jpg");
        item3.setRating(9.0);
        item3.setDetailLink("http://m.imdb.com/title/tt0071562/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_3");

        IMBD item4 = new IMBD();
        item4.setMovie_id(4);
        item4.setName("The Dark Knight");
        item4.setYearofrelease(2008);
        item4.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item4.setRating(9.0);
        item4.setDetailLink("http://m.imdb.com/title/tt0468569/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_4");

        IMBD item5 = new IMBD();
        item5.setMovie_id(5);
        item5.setName("Angry Men");
        item5.setYearofrelease(1957);
        item5.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item5.setRating(8.9);
        item5.setDetailLink("http://m.imdb.com/title/tt0050083/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_5");

        IMBD item6 = new IMBD();
        item6.setMovie_id(6);
        item6.setName("Schindler's List");
        item6.setYearofrelease(1993);
        item6.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item6.setRating(8.9);
        item6.setDetailLink("http://m.imdb.com/title/tt0108052/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_6");

        IMBD item7 = new IMBD();
        item7.setMovie_id(7);
        item7.setName("Pulp Fiction");
        item7.setYearofrelease(1994);
        item7.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTA5OTAzMl5BMl5BanBnXkFtZTgwNjA5MDc3NjE@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item7.setRating(8.9);
        item7.setDetailLink("http://m.imdb.com/title/tt0110912/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_7");

        IMBD item8 = new IMBD();
        item8.setMovie_id(8);
        item8.setName("The Lord of the Rings: The Return of the King");
        item8.setYearofrelease(2003);
        item8.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BYWY1ZWQ5YjMtMDE0MS00NWIzLWE1M2YtODYzYTk2OTNlYWZmXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item8.setRating(8.9);
        item8.setDetailLink("http://m.imdb.com/title/tt0167260/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_8");

        IMBD item9 = new IMBD();
        item9.setMovie_id(9);
        item9.setName("The Good, the Bad and the Ugly");
        item9.setYearofrelease(1966);
        item9.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BOTQ5NDI3MTI4MF5BMl5BanBnXkFtZTgwNDQ4ODE5MDE@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item9.setRating(8.8);
        item9.setDetailLink("http://m.imdb.com/title/tt0060196/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_9");

        IMBD item10 = new IMBD();
        item10.setMovie_id(10);
        item10.setName("Fight Club");
        item10.setYearofrelease(1999);
        item10.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BZGY5Y2RjMmItNDg5Yy00NjUwLThjMTEtNDc2OGUzNTBiYmM1XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item10.setRating(8.8);
        item10.setDetailLink("http://m.imdb.com/title/tt0137523/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_10");

        IMBD item11 = new IMBD();
        item11.setMovie_id(11);
        item11.setName("The Lord of the Rings: The Fellowship of the Ring");
        item11.setYearofrelease(2001);
        item11.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item11.setRating(8.8);
        item11.setDetailLink("http://m.imdb.com/title/tt0120737/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_11");

        IMBD item12 = new IMBD();
        item12.setMovie_id(12);
        item12.setName("Forrest Gump");
        item12.setYearofrelease(1994);
        item12.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY128_CR1,0,86,128_AL_.jpg");
        item12.setRating(8.7);
        item12.setDetailLink("http://m.imdb.com/title/tt0109830/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_12");

        IMBD item13 = new IMBD();
        item13.setMovie_id(13);
        item13.setName("Star Wars: Episode V - The Empire Strikes Back");
        item13.setYearofrelease(1980);
        item13.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BYmViY2M2MTYtY2MzOS00YjQ1LWIzYmEtOTBiNjhlMGM0NjZjXkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item13.setRating(8.7);
        item13.setDetailLink("http://m.imdb.com/title/tt0080684/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_13");

        IMBD item14 = new IMBD();
        item14.setMovie_id(14);
        item14.setName("Inception");
        item14.setYearofrelease(2010);
        item14.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item14.setRating(8.7);
        item14.setDetailLink("http://m.imdb.com/title/tt1375666/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_14");

        IMBD item15 = new IMBD();
        item15.setMovie_id(15);
        item15.setName("The Lord of the Rings: The Two Towers");
        item15.setYearofrelease(2002);
        item15.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BMDY0NmI4ZjctN2VhZS00YzExLTkyZGItMTJhOTU5NTg4MDU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UY128_CR1,0,86,128_AL_.jpg");
        item15.setRating(8.7);
        item15.setDetailLink("http://m.imdb.com/title/tt0167261/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_15");

        IMBD item16 = new IMBD();
        item16.setMovie_id(16);
        item16.setName("One Flew Over the Cuckoo's Nest");
        item16.setYearofrelease(1975);
        item16.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BZjA0OWVhOTAtYWQxNi00YzNhLWI4ZjYtNjFjZTEyYjJlNDVlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY128_CR0,0,86,128_AL_.jpg");
        item16.setRating(8.7);
        item16.setDetailLink("http://m.imdb.com/title/tt0073486/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_16");

        IMBD item17 = new IMBD();
        item17.setMovie_id(17);
        item17.setName("Goodfellas");
        item17.setYearofrelease(1990);
        item17.setImageurl("https://images-na.ssl-images-amazon.com/images/M/MV5BNThjMzczMjctZmIwOC00NTQ4LWJhZWItZDdhNTk5ZTdiMWFlXkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UX86_CR0,0,86,128_AL_.jpg");
        item17.setRating(8.7);
        item17.setDetailLink("http://m.imdb.com/title/tt0099685/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042122&pf_rd_r=07V3SZX0PBV5SZMZXKJ1&pf_rd_s=top-1&pf_rd_t=15506&pf_rd_i=top&ref_=m_chttp_tt_17");

        imbdList.add(item1);
        imbdList.add(item2);
        imbdList.add(item3);
        imbdList.add(item4);
        imbdList.add(item5);
        imbdList.add(item6);
        imbdList.add(item7);
        imbdList.add(item8);
        imbdList.add(item9);
        imbdList.add(item10);
        imbdList.add(item11);
        imbdList.add(item12);
        imbdList.add(item13);
        imbdList.add(item14);
        imbdList.add(item15);
        imbdList.add(item16);
        imbdList.add(item17);

        return imbdList;
    }

}


