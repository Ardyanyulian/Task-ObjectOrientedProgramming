employee1 = ['Edcorner', 104120 , "Developer" , "Dept. 2A"];
employee2 = ['Learning', 211240 , "Designer", "Dept. 3B"];
employee3 = ['John', 131124, "Manager", "Dept. 1E"];


class Human:
    species = "Homosapiens";

    def __init__(self , name, age, gender):
        self.name= name;
        self.age = age;
        self.gender = gender;

X = Human('Edcorner', 30 , "male");
Y = Human('Learning', 32 , "female");


print(Y.age);   
print(X.age);

X.name = "Johan";
print(f"Hello my name is {X.name}, Iam a {X.gender} and Iam {X.age} years old");
print(f"Hello my name is {Y.name }, Iam a {Y.gender} and Iam {Y.age} years old");    