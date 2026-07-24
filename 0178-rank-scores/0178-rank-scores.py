import pandas as pd

def order_scores(scores: pd.DataFrame) -> pd.DataFrame:
    # Compute dense rank in descending order
    scores['rank'] = scores['score'].rank(method='dense', ascending=False)
    
    # Sort by score descending and return only the required columns
    return scores[['score', 'rank']].sort_values(by='score', ascending=False)