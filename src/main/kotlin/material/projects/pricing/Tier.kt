package material.projects.pricing

import mui.material.ButtonVariant

data class Tier(
    val buttonText: String,
    val buttonVariant: ButtonVariant,
    val description: List<String>,
    val price: String,
    val title: String
)

val tiers = listOf(
    Tier(
        buttonText = "Sign up for Free",
        buttonVariant = ButtonVariant.outlined,
        description = listOf(
            "10 users included",
            "2GB of storage",
            "Help center access",
            "Email support",
        ),
        price = "0",
        title = "Free"
    ),
    Tier(
        buttonText = "Get Started",
        buttonVariant = ButtonVariant.contained,
        description = listOf(
            "20 users included",
            "10GB of storage",
            "Help center access",
            "Priority Email support",
        ),
        price = "15",
        title = "Pro"
    ),
    Tier(
        buttonText = "Contact Us",
        buttonVariant = ButtonVariant.outlined,
        description = listOf(
            "50 users included",
            "30GB of storage",
            "Help center access",
            "Phone & Email support",
        ),
        price = "30",
        title = "Enterprise"
    )
)
