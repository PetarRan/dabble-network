package neo4jproject.springframework.domain;

import org.neo4j.ogm.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@NodeEntity(label = "Post")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Property(name = "email")
    private String email;
    @Property(name = "description")
    private String description;
    @Property(name = "imageUrl")
    private String imageUrl;
    @Property(name = "firstName")
    private String firstName;
    @Property(name = "lastName")
    private String lastName;
    @Property(name = "phoneNumber")
    private String phoneNumber;
    @Property(name = "travelling")
    private Boolean isTravelling;

    @Relationship(type = "Follows")
    private List<User> following;

    @Relationship(type = "Liked")
    private List<Post> likedPosts;

    @Relationship(type = "Posted")
    private List<Post> myPosts;

    public User(String email, String description,
                String imageUrl, String firstName,
                String lastName, String phoneNumber,
                Boolean isTravelling, List<User> following, List<Post> likedPosts, List<Post> myPosts) {
        this.id = null;
        this.email = email;
        this.description = description;
        this.imageUrl = imageUrl;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.isTravelling = isTravelling;
        this.following = following;
        this.likedPosts = likedPosts;
        this.myPosts = myPosts;
    }

    public User withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            return new User(this.email, this.description, this.imageUrl, this.firstName,
                    this.lastName, this.phoneNumber, this.isTravelling, this.following, this.likedPosts,
                    this.myPosts);
        }
    }

    public Boolean getTravelling() {
        return isTravelling;
    }

    public void setTravelling(Boolean travelling) {
        isTravelling = travelling;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<Post> getLikedPosts() {
        return likedPosts;
    }

    public void setLikedPosts(List<Post> likedPosts) {
        this.likedPosts = likedPosts;
    }

    public List<Post> getMyPosts() {
        return myPosts;
    }

    public void setMyPosts(List<Post> myPosts) {
        this.myPosts = myPosts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isTravelling() {
        return isTravelling;
    }

    public void setTravelling(boolean travelling) {
        isTravelling = travelling;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}