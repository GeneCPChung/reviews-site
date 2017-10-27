package reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review review1 = new Review(12345L, "The Matrix", "/images/the-matrix.jpg", "Sci-fi",
				"(1999) The story of a reluctant Christ-like protagonist set against a baroque, MTV backdrop, The Matrix is the definitive hybrid of technical wizardry and contextual excellence that should be the benchmark for all sci-fi films to come.");
		Review review2 = new Review(23456L, "Beaches", "/images/beaches.jpg", "Chick-Flicks",
				"(1988) There are good movies and there are those you'll never forget that you can see many many times. Beaches definitely goes into the latter category");
		Review review3 = new Review(34567L, "Dumb & Dumber", "/images/dumb-and-dumber.jpg", "Comedy",
				"(1994) Jim Carrey and Jeff Daniels give the greatest comedic performances and form the best duo that has ever graced a screen. Every scene, every sentence they speak, and every body movement is pure genius.");
		Review review4 = new Review(45678L, "Full Metal Jacket", "/images/fmj.jpg", "Sci-fi",
				"(1987) Stanley Kubrick's Full Metal Jacket seems like an uncompleted film, but to me that's poetic justice to one of America's uncompleted wars. The film is harsh and doesn't turn a blind eye to the atrocities of Vietnam.");

		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(long id) {
		return reviews.get(id);
	}

}
