@regression @ui @etsyTitleValidation
  Feature: Validating Etsy titles

    Scenario Outline: Validating titles of each module
      Given User navigates to Etsy application
      When User click on "<Module>" module
      Then User validates the "<Title>" title
      Examples:
      | Module                  | Title                                |
      | Fashion Favourites      | Fashion favourites                   |
#      | Jewellery & Accessories | Jewellery & Accessories - Etsy       |
#      | Clothing  & Shoes       | Clothing & Shoes - Etsy              |
#      | Home & Living           | Home & Living - Etsy                 |
#      | Wedding & Party         | Wedding & Party - Etsy               |
#      | Toys & Entertainment    | Toys & Entertainment - Etsy          |
#      | Art & Collectibles      | Art & Collectibles - Etsy            |
#      | Craft Supplies          | Craft Supplies & Tools - Etsy        |
      | Gifts & Gift Cards      | The Etsy Gift Guide for 2023 \| Etsy |