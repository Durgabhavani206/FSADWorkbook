import { useEffect, useState } from "react";
import axios from "axios";
import "./Profile.css";

export default function Profile() {

  const [user, setUser] = useState(null);

  useEffect(() => {
    const storedUser = JSON.parse(localStorage.getItem("user"));

    axios
      .get(`http://localhost:8080/api/profile/${storedUser.id}`)
      .then((res) => setUser(res.data))
      .catch((err) => console.error(err));
  }, []);

  // ⛔ Wait until data loads
  if (!user) {
    return <h3 style={{ textAlign: "center" }}>Loading...</h3>;
  }

  return (
    <div className="profile-container">
      <div className="profile-card">
        <h2>Profile</h2>

        <img
          src="/Profile.jpg"
          alt="profile"
          className="profile-img"
        />

        <p><strong>Username:</strong> {user.username}</p>
        <p><strong>Email:</strong> {user.email}</p>
      </div>
    </div>
  );
}