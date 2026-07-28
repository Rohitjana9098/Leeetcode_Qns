import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    # Filter rows based on area OR population criteria
    is_big = (world['area'] >= 3000000) | (world['population'] >= 25000000)
    
    # Return selected columns
    return world[is_big][['name', 'population', 'area']]