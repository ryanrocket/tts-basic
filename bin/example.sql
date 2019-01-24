/* EXAMPLE OF AWS-RDS DB QUERY FOR CREDENTIALS */

USE maindb;
SELECT password FROM credentials
  WHERE username=userNAME;
  
/* In this example... maindb is the database and userNAME is the username
 * that the user input while signing in!
 */

/* EXAMPLE OF TABLE FOR CREDENTIALS */

USE maindb;
CREATE TABLE creds (
  id INTEGER,
  username TEXT,
  password TEXT,
  loginType TEXT,
  realname TEXT
);
INSERT INTO creds(username, password)
  VALUES('admin', 'password');

/* SAMPLES FROM RYAN WANS */
