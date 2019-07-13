package com.example.materialdesigntest;

import java.util.ArrayList;

public class DataStore {
    private ArrayList<FoodBean> foodList;

    public DataStore(){}

    public DataStore(ArrayList<FoodBean> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<FoodBean> initData() {
        foodList = new ArrayList<>();
        foodList.add(new FoodBean(R.mipmap.img3,
                "Coconut Curry",
                "Cost: $ 11",
                "Time: 15m",
                " - 1 can coconut milk\n " +
                        "- 2 tablespoons red curry paste\n " +
                        "- 2 small heads broccoli (and/or other veggies of choice)\n " +
                        "- 1 can chickpeas, rinsed and drained\n " +
                        "- 1/2 tablespoon cornstarch dissolved in 2 tablespoons cold water\n " +
                        "optional: minced garlic or onion\n",
                "Saute broccoli (and onion/garlic if you’re using it) in a tablespoon of oil. After a few minutes, add the coconut milk and let simmer for 5-8 minutes. \n" +
                        " The broccoli should soften but still be tender-crisp." +
                " Add the curry paste to the pan and whisk it until it combines with the coconut milk. Add the chickpeas.\n" +
                " Bring to a slight boil and add the cornstarch. Boil for about a minute, then reduce heat and let cool slightly. Sauce will thicken as the mixture cools.\n",
                "geo:40.742100,-73.994114"));
        foodList.add(new FoodBean(R.mipmap.img4,
                "Garlic Butter Brazilian Steak",
                "Cost: $ 10", "Time: 20m",
                "   - 1 lb skirt steak \n" +
                        " - salt and pepper for taste \n" +
                        " - 6 tsp minced garlic Add half if you like a less garlic flavor \n" +
                        " - 1/4 cup chopped parsley plus 1/8 cup \n" +
                        " - 5 tbsp unsalted butter \n" +
                        " - salt to taste for the butter \n ",
                "Cut the steak into 3 or 4 parts. Pat the steaks dry then season both sides liberally with salt and pepper\n" +
                " In a heavy duty skillet large enough for the skirt steak, heat oil over medium-high heat until it’s very hot. Add the steak and sear both sides (brown both sides) for 2-3 minutes until medium rare or cook longer until your desired doneness. I cooked mine for about 4 minutes on each side. Place steaks to rest on a plate and cover with foil.\n" +
                " In a skillet melt the butter over low heat then add the garlic. Cook swirling or using a spatula to move the butter and garlic around until lightly golden. Don’t over cook, or the butter and garlic will burn.\n" +
                " Pour the garlic butter into a bowl and salt to taste. Slice the steak against the grain. Garnish with parsley and then spoon or pour the garlic butter over the steak. Serve immediately.\n",
                "geo:40.659866,-74.106690"));
        foodList.add(new FoodBean(R.mipmap.img8,
                "Spicy Shrimp and Rice",
                "Cost: $ 8",
                "Time: 20m",
                " - 2 tablespoons coconut oil\n" +
                        " - 2 carrots thinly sliced into matchsticks\n" +
                        " - 1 red bell pepper thinly sliced\n" +
                        " - 1 green bell pepper thinly sliced\n" +
                        " - 2 cloves garlic minced\n" +
                        " - 1 tablespoon grated ginger\n" +
                        " - 2 tablespoons Thai red curry paste\n" +
                        " - 2 1/2 cups chicken or vegetable broth\n" +
                        " - 1 (14-ounce) can coconut milk\n" +
                        " - 2 cups uncooked white rice\n" +
                        " - 1 pound shrimp peeled and deveined\n" +
                        " - 1 tablespoon lime juice\n" +
                        " - Chopped fresh cilantro for garnishing\n",
                "In a large pot, heat the oil over medium heat. \n Add the carrots and bell pepper and sauté for 4 - 5 minutes, until slightly softened. \n" +
                        " Add the garlic, ginger and curry paste and cook for another minute until fragrant. Stir in the broth, coconut milk and rice. \n" +
                        " Increase heat to high and bring mixture to a boil. Reduce heat to medium-low, cover and cook for 10 - 15 minutes or until most of the liquid is absorbed and the rice is almost cooked through. \n " +
                        "Stir in the shrimp. Cover and cook for about 5 minutes until shrimp is pink and opaque. Stir in the lime juice, sprinkle with cilantro and serve.",
                "geo:40.747780,-74.137602"));
        foodList.add(new FoodBean(R.mipmap.img6,
                "Loaded Cheesy, Bacon, Corn, and Potato Chowder",
                "Cost: $ 18",
                "Time: 30m",
                " -12 ounces (3/4 of one pound) bacon, diced small\n" +
                " -2 cups sweet Vidalia or yellow onions, peeled and diced small (about 1 medium/large onion)\n" +
                " -1 cup carrots, peeled and diced small (about 2 large carrots)\n" +
                " -1 cup celery, diced small (about 2 stalks)\n" +
                " -4 garlic cloves, finely minced\n" +
                " -1/4 cup all-purpose flour\n" +
                " -32 ounces (4 cups) low-sodium chicken broth\n" +
                " -4 cups milk, or as needed (I use Silk Unsweetened Cashewmilk)\n" +
                " -2 1/2 cups Russet potatoes, peeled and diced into 1/4-inch cubes (about 2 extra-large potatoes)\n" +
                " -1 teaspoon dried thyme\n" +
                " -1 teaspoon dried oregano\n" +
                " -1 teaspoon salt, or to taste\n" +
                " -1 teaspoon pepper, or to taste\n" +
                " -pinch cayenne pepper, optional and to taste\n" +
                " -2 cups corn (I used frozen and added it straight from the freezer)\n" +
                " -8 ounces extra-sharp cheddar cheese (grate it yourself, pre-grated cheese in plastic bags is resistant to melting)\n" +
                " -1/3 cup fresh flat-leaf parsley leaves, finely chopped",
                "To a large Dutch oven or stockpot, add the bacon and cook over medium-high heat until crisp, about 10 minutes; stir intermittently. Using a slotted spoon, remove bacon from pot and place on paper towels; set aside. Keep the bacon grease in the stockpot. You could drain some off if desired but I didn’t because there are a lot of vegetables that need to sauté in it.\n" +
                        "\n" +
                        "Add the onion, carrots, celery, and sauté for about 7 to 9 minutes, or until vegetables begin to soften. Stir intermittently.\n" +
                        "Add the garlic and sauté for another 1 to 2 minutes.\n" +
                        "Add the flour and whisk constantly until lightly browned, about 1 minute.\n" +
                        "Add the chicken broth, milk, potatoes, thyme, oregano, salt, pepper, optional cayenne, and bring to a boil. Allow chowder to boil fairly rapidly for about 15 minutes or until potatoes are fork-tender; stir intermittently. At any time while the chowder is boiling, if the overall liquid level is lower than you like and the chowder is too thick, adding a cup of extra chicken broth (or milk or water) is okay. At the end you will adjust the seasoning levels.\n" +
                        "After potatoes are soft, add the corn, and boil for 1 to 2 minutes to warm the corn through.\n" +
                        "Reduce the heat to low, add most of the bacon bits (reserve about 1/4 cup for garnishing), and add the cheese slowly, and stir continuously until melted and combined.\n" +
                        "Add the parsley and stir to combine.\n" +
                        "Taste chowder and add salt to taste. " +
                        "It will vary based on how salty the brand of chicken broth used is, " +
                        "how salty the bacon and cheese are, and personal preference. Make any necessary seasoning adjustments (i.e. more salt, pepper, herbs, etc.), garnish with bacon and cheese if desired, and serve immediately. Chowder will keep airtight in the fridge for 5 to 7 days; reheat very gently prior to serving so it doesn’t ‘break’. I haven’t tried freezing the chowder.\n",
                "geo:40.716164,-73.986755"));
        foodList.add(new FoodBean(R.mipmap.img7, "Monterrey Chicken Bake", "Cost: $ 16", "Time: 50m",
                " - 4-6 boneless skinless chicken breasts\n" +
                " - 1 (14.5oz) can of diced fire roasted tomatoes\n" +
                " - 1 (4 oz) can green chilies\n" +
                " - 1 cup mexican blend shredded cheese\n" +
                " - 1/2 cup green onion\n" +
                " - 1/4 cup BBQ sauce\n",
                "Heat the oven to 350. Wash and clean your chicken breasts and then place them in a 9 x 12 glass baking dish. \n" +
                        "Take the BBQ sauce and a brush and cover the tops of the chicken breasts with the BBQ sauce. Then take the fire roasted tomatoes and cover the chicken breasts as well. \n" +
                        " Do not drain the tomatoes before, you want the juice and all in the dish. Then grab the green chilies and cover the tops of the chicken breasts. \n " +
                        "Place in the oven and bake for 45 minutes. Remove the chicken from the oven and cover with cheese and green onion tops. Bake for an additional 15 minutes. Allow to cool before serving.\n",
                "geo:40.730051,-73.980072"));
        foodList.add(new FoodBean(R.mipmap.img9, "Protein-Packed Vegetarian Burrito Bowls", "Cost: $ 20", "Time: 15m", "\n" +
                "4 Chile Relleno Boca Essentials patties\n" +
                "3 cups cooked brown rice\n" +
                "1 cup grape tomatoes, quartered\n" +
                "1 ½ cups shredded Romaine lettuce\n" +
                "½ ripe Haas avocado, diced (optional)\n" +
                "Corn salsa:\n" +
                "1 cup cooked corn\n" +
                "2 tablespoons finely chopped red onion\n" +
                "1 tablespoon chopped cilantro\n" +
                "1 teaspoon lime juice\n" +
                "1/8 teaspoon kosher salt\n" +
                "Avocado Cilantro Sauce:\n" +
                "½ ripe Haas avocado\n" +
                "2 tablespoons nonfat plain Greek yogurt\n" +
                "2 tablespoons cilantro\n" +
                "1 ½ teaspoons lime juice\n" +
                "½ teaspoon honey\n" +
                "2 tablespoons water\n" +
                "1/8 teaspoon kosher salt\n",
                "Cook the Chile Relleno Boca Essentials patties according to package directions. Chop them into bite-sized pieces.\n" +
                        "Mix all of the corn salsa ingredients together in a bowl.\n" +
                        "To make the avocado cilantro sauce, puree all of the ingredients in a mini food processor or blender. Adjust seasoning to taste.\n" +
                        "Divide the rice among 4 bowls. Top with equal portions of Boca patties, corn salsa, tomato, lettuce and avocado. Drizzle the avocado cilantro sauce on top. Enjoy!\n",
                "geo:40.747780,-74.137602"));
        return foodList;
    }
}
